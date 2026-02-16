package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ShieldChevronFill: ImageVector
    get() {
        if (_ShieldChevronFill != null) {
            return _ShieldChevronFill!!
        }
        _ShieldChevronFill = ImageVector.Builder(
            name = "Filled.ShieldChevronFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 40f)
                lineTo(48f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 56f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 52.72f, 25.52f, 84.67f, 46.93f, 102.19f)
                curveToRelative(23.06f, 18.86f, 46f, 25.26f, 47f, 25.53f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, 0f)
                curveToRelative(1f, -0.27f, 23.91f, -6.67f, 47f, -25.53f)
                curveTo(198.48f, 196.67f, 224f, 164.72f, 224f, 112f)
                lineTo(224f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 40f)
                close()
                moveTo(208f, 112f)
                quadToRelative(0f, 26.31f, -9.14f, 47.84f)
                lineToRelative(-66.27f, -46.39f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.18f, 0f)
                lineTo(57.13f, 159.84f)
                curveTo(51.06f, 145.52f, 48f, 129.54f, 48f, 112f)
                lineToRelative(0f, -56f)
                lineToRelative(160f, 0f)
                close()
            }
        }.build()

        return _ShieldChevronFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldChevronFill: ImageVector? = null
