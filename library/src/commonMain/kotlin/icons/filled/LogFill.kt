package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LogFill: ImageVector
    get() {
        if (_LogFill != null) {
            return _LogFill!!
        }
        _LogFill = ImageVector.Builder(
            name = "Filled.LogFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(212f, 136f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 212f, 136f)
                close()
                moveTo(248f, 136f)
                curveToRelative(0f, 40.37f, -21.08f, 72f, -48f, 72f)
                lineTo(56f, 208f)
                curveToRelative(-26.92f, 0f, -48f, -31.63f, -48f, -72f)
                reflectiveCurveTo(29.08f, 64f, 56f, 64f)
                lineTo(92.69f, 64f)
                lineToRelative(37.65f, -37.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 24f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(139.31f, 40f)
                lineToRelative(-24f, 24f)
                lineTo(200f, 64f)
                curveTo(226.92f, 64f, 248f, 95.63f, 248f, 136f)
                close()
                moveTo(104f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(33.26f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 16f)
                close()
                moveTo(154.91f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(80f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(66.91f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 154.91f, 160f)
                close()
                moveTo(232f, 136f)
                curveToRelative(0f, -30.36f, -14.65f, -56f, -32f, -56f)
                reflectiveCurveToRelative(-32f, 25.64f, -32f, 56f)
                reflectiveCurveToRelative(14.65f, 56f, 32f, 56f)
                reflectiveCurveTo(232f, 166.36f, 232f, 136f)
                close()
            }
        }.build()

        return _LogFill!!
    }

@Suppress("ObjectPropertyName")
private var _LogFill: ImageVector? = null
