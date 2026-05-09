@file:OptIn(InternalResourceApi::class)
package phosphor_compose.composeApp.generated.resources
import phosphor_compose.composeapp.generated.resources.Res


import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.ResourceContentHash
import org.jetbrains.compose.resources.ResourceItem

private const val MD: String = "composeResources/webtesting.composeapp.generated.resources/"

@OptIn(InternalResourceApi::class)
@delegate:ResourceContentHash(379_089_144)
internal val Res.drawable.compose_multiplatform: DrawableResource by lazy {
    DrawableResource("drawable:compose_multiplatform", setOf(
        ResourceItem(setOf(), "${MD}drawable/compose-multiplatform.xml", -1, -1),
    ))
}

@InternalResourceApi
internal fun _collectCommonMainDrawable0Resources(map: MutableMap<String, DrawableResource>) {
    map.put("compose_multiplatform", Res.drawable.compose_multiplatform)
}
