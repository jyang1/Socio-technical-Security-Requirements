/*
* StstoolItemProviderAdapterFactory.java
*
* This file is part of the STS-Tool project.
* Copyright (c) 2011-2012 "University of Trento - DISI" All rights reserved.
*
* Is strictly forbidden to remove this copyright notice from this source code.
*
* Disclaimer of Warranty:
* STS-Tool (this software) is provided "as-is" and without warranty of any kind, 
* express, implied or otherwise, including without limitation, any warranty of 
* merchantability or fitness for a particular purpose.
* In no event shall the copyright holder or contributors be liable for any direct,
* indirect, incidental, special, exemplary, or consequential damages
* including, but not limited to, procurement of substitute goods or services;
* loss of use, data, or profits; or business interruption) however caused and on
* any theory of liability, whether in contract, strict liability, or tort (including
* negligence or otherwise) arising in any way out of the use of this software, even 
* if advised of the possibility of such damage.
*
* This program is free software; you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License version 3
* as published by the Free Software Foundation with the addition of the
* following permission added to Section 15 as permitted in Section 7(a):
* FOR ANY PART OF THE COVERED WORK IN WHICH THE COPYRIGHT IS OWNED BY 
* "University of Trento - DISI","University of Trento - DISI" DISCLAIMS THE
* WARRANTY OF NON INFRINGEMENT OF THIRD PARTY RIGHTS.
*
* See the GNU Affero General Public License for more details.
* You should have received a copy of the GNU Affero General Public License
* along with this program; if not, see http://www.gnu.org/licenses or write to
* the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
* Boston, MA, 02110-1301 USA, or download the license from the following URL:
* http://www.sts-tool.eu/License.php
*
* For more information, please contact STS-Tool group at this
* address: ststool@disi.unitn.it
*
*/
/**
 * DISI - University of Trento
 * 
 * $Id$
 */
package eu.aniketos.wp1.ststool.provider;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import eu.aniketos.wp1.ststool.util.StstoolAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class StstoolItemProviderAdapterFactory extends StstoolAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String			copyright		= "DISI - University of Trento";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory	parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier			changeNotifier	= new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object>		supportedTypes	= new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StstoolItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.StsToolDiagram} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StsToolDiagramItemProvider	stsToolDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.StsToolDiagram}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStsToolDiagramAdapter(){
		if (stsToolDiagramItemProvider == null) {
			stsToolDiagramItemProvider = new StsToolDiagramItemProvider(this);
		}

		return stsToolDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Actor} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorItemProvider	actorItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Actor}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActorAdapter(){
		if (actorItemProvider == null) {
			actorItemProvider = new ActorItemProvider(this);
		}

		return actorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Delegation} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationItemProvider	delegationItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Delegation}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelegationAdapter(){
		if (delegationItemProvider == null) {
			delegationItemProvider = new DelegationItemProvider(this);
		}

		return delegationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Provision} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvisionItemProvider	provisionItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Provision}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProvisionAdapter(){
		if (provisionItemProvider == null) {
			provisionItemProvider = new ProvisionItemProvider(this);
		}

		return provisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Agent} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentItemProvider	agentItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Agent}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAgentAdapter(){
		if (agentItemProvider == null) {
			agentItemProvider = new AgentItemProvider(this);
		}

		return agentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Role} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProvider	roleItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Role}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAdapter(){
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProvider(this);
		}

		return roleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.TResource} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TResourceItemProvider	tResourceItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.TResource}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTResourceAdapter(){
		if (tResourceItemProvider == null) {
			tResourceItemProvider = new TResourceItemProvider(this);
		}

		return tResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Goal} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalItemProvider	goalItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Goal}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoalAdapter(){
		if (goalItemProvider == null) {
			goalItemProvider = new GoalItemProvider(this);
		}

		return goalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Authorisation} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorisationItemProvider	authorisationItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Authorisation}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAuthorisationAdapter(){
		if (authorisationItemProvider == null) {
			authorisationItemProvider = new AuthorisationItemProvider(this);
		}

		return authorisationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Resource} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceItemProvider	resourceItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Resource}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAdapter(){
		if (resourceItemProvider == null) {
			resourceItemProvider = new ResourceItemProvider(this);
		}

		return resourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.IResource} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IResourceItemProvider	iResourceItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.IResource}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIResourceAdapter(){
		if (iResourceItemProvider == null) {
			iResourceItemProvider = new IResourceItemProvider(this);
		}

		return iResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.NonTransferableAuthorisation} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NonTransferableAuthorisationItemProvider	nonTransferableAuthorisationItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.NonTransferableAuthorisation}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNonTransferableAuthorisationAdapter(){
		if (nonTransferableAuthorisationItemProvider == null) {
			nonTransferableAuthorisationItemProvider = new NonTransferableAuthorisationItemProvider(this);
		}

		return nonTransferableAuthorisationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.TransferableAuthorisation} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferableAuthorisationItemProvider	transferableAuthorisationItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.TransferableAuthorisation}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransferableAuthorisationAdapter(){
		if (transferableAuthorisationItemProvider == null) {
			transferableAuthorisationItemProvider = new TransferableAuthorisationItemProvider(this);
		}

		return transferableAuthorisationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.GoalContribution} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalContributionItemProvider	goalContributionItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.GoalContribution}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoalContributionAdapter(){
		if (goalContributionItemProvider == null) {
			goalContributionItemProvider = new GoalContributionItemProvider(this);
		}

		return goalContributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.GoalDecomposition} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalDecompositionItemProvider	goalDecompositionItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.GoalDecomposition}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoalDecompositionAdapter(){
		if (goalDecompositionItemProvider == null) {
			goalDecompositionItemProvider = new GoalDecompositionItemProvider(this);
		}

		return goalDecompositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.PositiveGoalContribution} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PositiveGoalContributionItemProvider	positiveGoalContributionItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.PositiveGoalContribution}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPositiveGoalContributionAdapter(){
		if (positiveGoalContributionItemProvider == null) {
			positiveGoalContributionItemProvider = new PositiveGoalContributionItemProvider(this);
		}

		return positiveGoalContributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.NegativeGoalContribution} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NegativeGoalContributionItemProvider	negativeGoalContributionItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.NegativeGoalContribution}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNegativeGoalContributionAdapter(){
		if (negativeGoalContributionItemProvider == null) {
			negativeGoalContributionItemProvider = new NegativeGoalContributionItemProvider(this);
		}

		return negativeGoalContributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.GoalDecompositionAND} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalDecompositionANDItemProvider	goalDecompositionANDItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.GoalDecompositionAND}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoalDecompositionANDAdapter(){
		if (goalDecompositionANDItemProvider == null) {
			goalDecompositionANDItemProvider = new GoalDecompositionANDItemProvider(this);
		}

		return goalDecompositionANDItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.GoalDecompositionOR} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalDecompositionORItemProvider	goalDecompositionORItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.GoalDecompositionOR}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoalDecompositionORAdapter(){
		if (goalDecompositionORItemProvider == null) {
			goalDecompositionORItemProvider = new GoalDecompositionORItemProvider(this);
		}

		return goalDecompositionORItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Event} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider	eventItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Event}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter(){
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Own} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OwnItemProvider	ownItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Own}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwnAdapter(){
		if (ownItemProvider == null) {
			ownItemProvider = new OwnItemProvider(this);
		}

		return ownItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Play} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayItemProvider	playItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Play}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlayAdapter(){
		if (playItemProvider == null) {
			playItemProvider = new PlayItemProvider(this);
		}

		return playItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.TangibleBy} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TangibleByItemProvider	tangibleByItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.TangibleBy}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTangibleByAdapter(){
		if (tangibleByItemProvider == null) {
			tangibleByItemProvider = new TangibleByItemProvider(this);
		}

		return tangibleByItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.PartOf} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PartOfItemProvider	partOfItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.PartOf}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartOfAdapter(){
		if (partOfItemProvider == null) {
			partOfItemProvider = new PartOfItemProvider(this);
		}

		return partOfItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Need} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NeedItemProvider	needItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Need}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNeedAdapter(){
		if (needItemProvider == null) {
			needItemProvider = new NeedItemProvider(this);
		}

		return needItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Produce} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ProduceItemProvider	produceItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Produce}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProduceAdapter(){
		if (produceItemProvider == null) {
			produceItemProvider = new ProduceItemProvider(this);
		}

		return produceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Modify} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyItemProvider	modifyItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Modify}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModifyAdapter(){
		if (modifyItemProvider == null) {
			modifyItemProvider = new ModifyItemProvider(this);
		}

		return modifyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Threat} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatItemProvider	threatItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Threat}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThreatAdapter(){
		if (threatItemProvider == null) {
			threatItemProvider = new ThreatItemProvider(this);
		}

		return threatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.StsRelation} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StsRelationItemProvider	stsRelationItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.StsRelation}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStsRelationAdapter(){
		if (stsRelationItemProvider == null) {
			stsRelationItemProvider = new StsRelationItemProvider(this);
		}

		return stsRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.StsObject} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StsObjectItemProvider	stsObjectItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.StsObject}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStsObjectAdapter(){
		if (stsObjectItemProvider == null) {
			stsObjectItemProvider = new StsObjectItemProvider(this);
		}

		return stsObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StringToStringMapItemProvider	stringToStringMapItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringToStringMapAdapter(){
		if (stringToStringMapItemProvider == null) {
			stringToStringMapItemProvider = new StringToStringMapItemProvider(this);
		}

		return stringToStringMapItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.IncompatibleDuties} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IncompatibleDutiesItemProvider	incompatibleDutiesItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.IncompatibleDuties}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIncompatibleDutiesAdapter(){
		if (incompatibleDutiesItemProvider == null) {
			incompatibleDutiesItemProvider = new IncompatibleDutiesItemProvider(this);
		}

		return incompatibleDutiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.CompatibleDuties} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CompatibleDutiesItemProvider	compatibleDutiesItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.CompatibleDuties}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompatibleDutiesAdapter(){
		if (compatibleDutiesItemProvider == null) {
			compatibleDutiesItemProvider = new CompatibleDutiesItemProvider(this);
		}

		return compatibleDutiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.aniketos.wp1.ststool.Dependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyItemProvider dependencyItemProvider;

	/**
	 * This creates an adapter for a {@link eu.aniketos.wp1.ststool.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDependencyAdapter() {
		if (dependencyItemProvider == null) {
			dependencyItemProvider = new DependencyItemProvider(this);
		}

		return dependencyItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory(){
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory){
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type){
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier,Object type){
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object,Object type){
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener){
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener){
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification){
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose(){
		if (stsToolDiagramItemProvider != null) stsToolDiagramItemProvider.dispose();
		if (actorItemProvider != null) actorItemProvider.dispose();
		if (delegationItemProvider != null) delegationItemProvider.dispose();
		if (provisionItemProvider != null) provisionItemProvider.dispose();
		if (agentItemProvider != null) agentItemProvider.dispose();
		if (roleItemProvider != null) roleItemProvider.dispose();
		if (tResourceItemProvider != null) tResourceItemProvider.dispose();
		if (goalItemProvider != null) goalItemProvider.dispose();
		if (authorisationItemProvider != null) authorisationItemProvider.dispose();
		if (resourceItemProvider != null) resourceItemProvider.dispose();
		if (iResourceItemProvider != null) iResourceItemProvider.dispose();
		if (nonTransferableAuthorisationItemProvider != null) nonTransferableAuthorisationItemProvider.dispose();
		if (transferableAuthorisationItemProvider != null) transferableAuthorisationItemProvider.dispose();
		if (goalContributionItemProvider != null) goalContributionItemProvider.dispose();
		if (goalDecompositionItemProvider != null) goalDecompositionItemProvider.dispose();
		if (positiveGoalContributionItemProvider != null) positiveGoalContributionItemProvider.dispose();
		if (negativeGoalContributionItemProvider != null) negativeGoalContributionItemProvider.dispose();
		if (goalDecompositionANDItemProvider != null) goalDecompositionANDItemProvider.dispose();
		if (goalDecompositionORItemProvider != null) goalDecompositionORItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (ownItemProvider != null) ownItemProvider.dispose();
		if (playItemProvider != null) playItemProvider.dispose();
		if (tangibleByItemProvider != null) tangibleByItemProvider.dispose();
		if (partOfItemProvider != null) partOfItemProvider.dispose();
		if (needItemProvider != null) needItemProvider.dispose();
		if (produceItemProvider != null) produceItemProvider.dispose();
		if (modifyItemProvider != null) modifyItemProvider.dispose();
		if (threatItemProvider != null) threatItemProvider.dispose();
		if (stsRelationItemProvider != null) stsRelationItemProvider.dispose();
		if (stsObjectItemProvider != null) stsObjectItemProvider.dispose();
		if (stringToStringMapItemProvider != null) stringToStringMapItemProvider.dispose();
		if (incompatibleDutiesItemProvider != null) incompatibleDutiesItemProvider.dispose();
		if (compatibleDutiesItemProvider != null) compatibleDutiesItemProvider.dispose();
		if (dependencyItemProvider != null) dependencyItemProvider.dispose();
	}

}
