package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.QuestionFill: ImageVector
    get() {
        if (_QuestionFill != null) {
            return _QuestionFill!!
        }
        _QuestionFill = ImageVector.Builder(
            name = "Filled.QuestionFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(128f, 192f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 192f)
                close()
                moveTo(136f, 143.28f)
                lineTo(136f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineToRelative(-8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                curveToRelative(13.23f, 0f, 24f, -9f, 24f, -20f)
                reflectiveCurveToRelative(-10.77f, -20f, -24f, -20f)
                reflectiveCurveToRelative(-24f, 9f, -24f, 20f)
                verticalLineToRelative(4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -19.85f, 17.94f, -36f, 40f, -36f)
                reflectiveCurveToRelative(40f, 16.15f, 40f, 36f)
                curveTo(168f, 125.38f, 154.24f, 139.93f, 136f, 143.28f)
                close()
            }
        }.build()

        return _QuestionFill!!
    }

@Suppress("ObjectPropertyName")
private var _QuestionFill: ImageVector? = null
