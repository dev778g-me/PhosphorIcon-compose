package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FootprintsFill: ImageVector
    get() {
        if (_FootprintsFill != null) {
            return _FootprintsFill!!
        }
        _FootprintsFill = ImageVector.Builder(
            name = "Filled.FootprintsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216.06f, 192f)
                verticalLineToRelative(12f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 204f)
                lineTo(144f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216.06f, 192f)
                close()
                moveTo(104f, 160f)
                horizontalLineToRelative(-56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(12f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 180f)
                lineTo(112f, 168f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 160f)
                close()
                moveTo(76f, 16f)
                curveTo(64.36f, 16f, 53.07f, 26.31f, 44.2f, 45f)
                curveToRelative(-13.93f, 29.38f, -18.56f, 73f, 0.29f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.2f, 2.93f)
                horizontalLineToRelative(50.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.2f, -2.93f)
                curveToRelative(18.85f, -23f, 14.22f, -66.65f, 0.29f, -96f)
                curveTo(98.85f, 26.31f, 87.57f, 16f, 76f, 16f)
                close()
                moveTo(154.8f, 168f)
                horizontalLineToRelative(50.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.2f, -2.93f)
                curveToRelative(18.85f, -23f, 14.22f, -66.65f, 0.29f, -96f)
                curveTo(202.93f, 50.31f, 191.64f, 40f, 180f, 40f)
                reflectiveCurveToRelative(-22.89f, 10.31f, -31.77f, 29f)
                curveToRelative(-13.93f, 29.38f, -18.56f, 73f, 0.29f, 96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 154.76f, 168f)
                close()
            }
        }.build()

        return _FootprintsFill!!
    }

@Suppress("ObjectPropertyName")
private var _FootprintsFill: ImageVector? = null
