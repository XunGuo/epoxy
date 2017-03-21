package com.airbnb.epoxy;

import android.support.annotation.LayoutRes;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

/**
 * Generated file. Do not modify! */
public class GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ extends GenerateDefaultLayoutMethodNextParentLayout.StillNoLayout implements GeneratedModel<Object> {
  private OnModelBoundListener<GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_, Object> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_, Object> onModelUnboundListener_epoxyGeneratedModel;

  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_() {
    super();
  }

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final Object object) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.");
  }

  @Override
  public void handlePostBind(final Object object, int position) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object, position);
    }
    validateStateHasNotChangedSinceAdded("The model was changed during the bind call.");
  }

  /**
   * Register a listener that will be called when this model is bound to a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ onBind(OnModelBoundListener<GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_, Object> listener) {
    validateMutability();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(Object object) {
    validateStateHasNotChangedSinceAdded("The model was changed between being being bound to the recycler view and being unbound.");
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
    validateStateHasNotChangedSinceAdded("The model was changed during the unbind method.");
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ onUnbind(OnModelUnboundListener<GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_, Object> listener) {
    validateMutability();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ id(CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ id(CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ layout(@LayoutRes int arg0) {
    super.layout(arg0);
    return this;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ show() {
    super.show();
    return this;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    return 1;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ that = (GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_) o;
    if ((onModelBoundListener_epoxyGeneratedModel == null) != (that.onModelBoundListener_epoxyGeneratedModel == null)) {
      return false;
    }
    if ((onModelUnboundListener_epoxyGeneratedModel == null) != (that.onModelUnboundListener_epoxyGeneratedModel == null)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + (onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_{" +
        "}" + super.toString();
  }
}