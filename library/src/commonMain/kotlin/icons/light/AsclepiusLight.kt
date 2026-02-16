package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.AsclepiusLight: ImageVector
    get() {
        if (_AsclepiusLight != null) {
            return _AsclepiusLight!!
        }
        _AsclepiusLight = ImageVector.Builder(
            name = "Light.AsclepiusLight",
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
                moveTo(128f, 24f)
                lineTo(128f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 166.11f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 184f)
                horizontalLineToRelative(0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                horizontalLineTo(96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 48f)
                horizontalLineToRelative(17f)
                arcToRelative(31f, 31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 31f, 31f)
                verticalLineToRelative(1f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                horizontalLineTo(96f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, 24f)
                horizontalLineToRelative(0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 48f)
                verticalLineToRelative(8f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 88f)
                horizontalLineTo(32f)
                verticalLineTo(80f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 48f)
                horizontalLineTo(96f)
            }
        }.build()

        return _AsclepiusLight!!
    }

@Suppress("ObjectPropertyName")
private var _AsclepiusLight: ImageVector? = null
