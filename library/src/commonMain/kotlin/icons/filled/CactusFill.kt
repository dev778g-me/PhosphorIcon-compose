package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CactusFill: ImageVector
    get() {
        if (_CactusFill != null) {
            return _CactusFill!!
        }
        _CactusFill = ImageVector.Builder(
            name = "Filled.CactusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(88f)
                verticalLineTo(136f)
                horizontalLineTo(80f)
                arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 72f)
                arcTo(24.07f, 24.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.08f, 48f)
                horizontalLineToRelative(0.4f)
                arcTo(23.55f, 23.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 71.52f)
                verticalLineTo(72f)
                horizontalLineToRelative(0f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 88f)
                horizontalLineToRelative(8f)
                verticalLineTo(56f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 0f)
                verticalLineToRelative(72f)
                horizontalLineToRelative(8f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-0.48f)
                arcTo(23.55f, 23.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 215.52f, 88f)
                horizontalLineToRelative(0.4f)
                arcTo(24.07f, 24.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 112f)
                arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 64f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 216f)
                close()
            }
        }.build()

        return _CactusFill!!
    }

@Suppress("ObjectPropertyName")
private var _CactusFill: ImageVector? = null
