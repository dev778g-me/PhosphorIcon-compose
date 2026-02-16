package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CakeFill: ImageVector
    get() {
        if (_CakeFill != null) {
            return _CakeFill!!
        }
        _CakeFill = ImageVector.Builder(
            name = "Filled.CakeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 88f)
                lineTo(136f, 88f)
                lineTo(136f, 79f)
                arcToRelative(32.06f, 32.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -31f)
                curveToRelative(0f, -28f, -26.44f, -45.91f, -27.56f, -46.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.88f, 0f)
                curveTo(122.44f, 2.09f, 96f, 20f, 96f, 48f)
                arcToRelative(32.06f, 32.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 31f)
                verticalLineToRelative(9f)
                lineTo(48f, 88f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, 24f)
                verticalLineToRelative(23.33f)
                arcToRelative(40.84f, 40.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 24.24f)
                lineTo(32f, 200f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                lineTo(200f, 224f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                lineTo(224f, 159.57f)
                arcToRelative(40.84f, 40.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -24.24f)
                lineTo(232f, 112f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 88f)
                close()
                moveTo(112f, 48f)
                curveToRelative(0f, -13.57f, 10f, -24.46f, 16f, -29.79f)
                curveToRelative(6f, 5.33f, 16f, 16.22f, 16f, 29.79f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
                close()
                moveTo(216f, 135.33f)
                curveToRelative(0f, 13.25f, -10.46f, 24.31f, -23.32f, 24.66f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24.68f, 24f)
                curveTo(50.46f, 159.64f, 40f, 148.58f, 40f, 135.33f)
                lineTo(40f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                lineTo(208f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                close()
            }
        }.build()

        return _CakeFill!!
    }

@Suppress("ObjectPropertyName")
private var _CakeFill: ImageVector? = null
