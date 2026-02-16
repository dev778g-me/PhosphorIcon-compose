package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NumberNineFill: ImageVector
    get() {
        if (_NumberNineFill != null) {
            return _NumberNineFill!!
        }
        _NumberNineFill = ImageVector.Builder(
            name = "Filled.NumberNineFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 24f)
                horizontalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                verticalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                close()
                moveTo(166.3f, 129.62f)
                curveToRelative(-0.07f, 0.13f, -0.12f, 0.26f, -0.2f, 0.38f)
                lineToRelative(-33.48f, 58f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.86f, -8f)
                lineToRelative(16.52f, -28.61f)
                arcTo(44.79f, 44.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 152f)
                arcToRelative(44.05f, 44.05f, 0f, isMoreThanHalf = true, isPositiveArc = true, 38.3f, -22.38f)
                close()
                moveTo(156f, 108f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, -28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 108f)
                close()
            }
        }.build()

        return _NumberNineFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberNineFill: ImageVector? = null
