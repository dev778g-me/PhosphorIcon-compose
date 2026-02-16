package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.CarSimpleDuotone: ImageVector
    get() {
        if (_CarSimpleDuotone != null) {
            return _CarSimpleDuotone!!
        }
        _CarSimpleDuotone = ImageVector.Builder(
            name = "Duotone.CarSimpleDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(32f, 112f)
                lineTo(61.89f, 44.75f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 69.2f, 40f)
                horizontalLineTo(186.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.31f, 4.75f)
                lineTo(224f, 112f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 112f)
                lineTo(240f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 208f)
                horizontalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(176f)
                horizontalLineTo(72f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(112f)
                lineTo(61.89f, 44.75f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 69.2f, 40f)
                horizontalLineTo(186.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.31f, 4.75f)
                lineTo(224f, 112f)
                verticalLineToRelative(88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 208f)
                close()
            }
        }.build()

        return _CarSimpleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CarSimpleDuotone: ImageVector? = null
