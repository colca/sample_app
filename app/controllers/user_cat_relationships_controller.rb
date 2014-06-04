class UserCatRelationshipsController < ApplicationController
  before_filter :signed_in_user
  
  def create
    @category = Category.find(params[:user_cat_relationship][:category_id])
    current_user.followCat!(@category)
    respond_to do |format|
      format.html { redirect_to categories_path }
      format.js
    end
  end

  def destroy
    @category = UserCatRelationship.find(params[:id]).category
    current_user.unfollowCat!(@category)
    respond_to do |format|
      format.html { redirect_to categories_path }
      format.js
    end
  end
end
