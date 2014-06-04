class UserDancerRelationshipsController < ApplicationController

  before_filter :signed_in_user
  
  def create
    @dancer = Dancer.find(params[:user_dancer_relationship][:dancer_id])
    @category = Category.find(@dancer.category_id)
    current_user.followDancer!(@dancer)
    redirect_to categories_path+'#tab'+@category.id.to_s
  end

  def destroy
    @dancer = UserDancerRelationship.find(params[:id]).dancer
    @category = Category.find(@dancer.category_id)
    current_user.unfollowDancer!(@dancer)
    redirect_to categories_path+'#tab'+@category.id.to_s
  end
end
