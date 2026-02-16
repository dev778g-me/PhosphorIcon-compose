package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.ListNumbersLight: ImageVector
    get() {
        if (_ListNumbersLight != null) {
            return _ListNumbersLight!!
        }
        _ListNumbersLight = ImageVector.Builder(
            name = "Light.ListNumbersLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 128f)
                lineTo(216f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 64f)
                lineTo(216f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 192f)
                lineTo(216f, 192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 104f)
                lineToRelative(0f, -64f)
                lineToRelative(-16f, 8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 208f)
                horizontalLineTo(40f)
                lineToRelative(28.68f, -38.37f)
                arcToRelative(15.69f, 15.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.24f, -22.41f)
                arcToRelative(16.78f, 16.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -23.06f, 3.15f)
                arcToRelative(15.85f, 15.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.38f, 4.3f)
            }
        }.build()

        return _ListNumbersLight!!
    }

@Suppress("ObjectPropertyName")
private var _ListNumbersLight: ImageVector? = null
