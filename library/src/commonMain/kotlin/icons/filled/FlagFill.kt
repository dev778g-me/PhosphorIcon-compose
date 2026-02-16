package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FlagFill: ImageVector
    get() {
        if (_FlagFill != null) {
            return _FlagFill!!
        }
        _FlagFill = ImageVector.Builder(
            name = "Filled.FlagFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 56f)
                verticalLineTo(176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.76f, 6f)
                curveToRelative(-15.28f, 13.23f, -29.89f, 18f, -43.82f, 18f)
                curveToRelative(-18.91f, 0f, -36.57f, -8.74f, -53f, -16.85f)
                curveTo(105.87f, 170f, 82.79f, 158.61f, 56f, 179.77f)
                verticalLineTo(224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.77f, -6f)
                horizontalLineToRelative(0f)
                curveToRelative(36f, -31.18f, 68.31f, -15.21f, 96.79f, -1.12f)
                curveTo(167f, 62.46f, 190.79f, 74.2f, 218.76f, 50f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 56f)
                close()
            }
        }.build()

        return _FlagFill!!
    }

@Suppress("ObjectPropertyName")
private var _FlagFill: ImageVector? = null
