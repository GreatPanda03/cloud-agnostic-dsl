package co7217.week18.entity.scoping;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import co7217.week18.entity.entityDsl.Network;
import co7217.week18.entity.entityDsl.ComputeInstance;
import co7217.week18.entity.entityDsl.VPC;
import co7217.week18.entity.entityDsl.EntityDslPackage;

public class EntityDslScopeProvider extends AbstractEntityDslScopeProvider {

    @Override
    public IScope getScope(EObject context, EReference reference) {
        // Scope VPC references
        if (context instanceof ComputeInstance &&
            reference == EntityDslPackage.Literals.COMPUTE_INSTANCE__VPC) {
            ComputeInstance compute = (ComputeInstance) context;
            Network network = compute.getNetwork();
            if (network != null && !network.getVpcs().isEmpty()) {
                return Scopes.scopeFor(network.getVpcs());
            }
        }
        //️⃣ Scope Subnet references
        if (context instanceof ComputeInstance &&
            reference == EntityDslPackage.Literals.COMPUTE_INSTANCE__SUBNET) {

            ComputeInstance compute = (ComputeInstance) context;
            VPC selectedVpc = compute.getVpc();
            if (selectedVpc != null && !selectedVpc.getSubnets().isEmpty()) {
                // Only allow subnets belonging to the selected VPC
                return Scopes.scopeFor(selectedVpc.getSubnets());
            }
        }
        return super.getScope(context, reference);
    }
}
