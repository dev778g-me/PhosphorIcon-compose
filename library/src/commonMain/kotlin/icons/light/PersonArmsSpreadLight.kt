package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.PersonArmsSpreadLight: ImageVector
    get() {
        if (_PersonArmsSpreadLight != null) {
            return _PersonArmsSpreadLight!!
        }
        _PersonArmsSpreadLight = ImageVector.Builder(
            name = "Light.PersonArmsSpreadLight",
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
                moveTo(128f, 40f)
                moveToRelative(-24f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(39f, 102.9f)
                curveTo(27.31f, 97.5f, 31.15f, 80f, 44f, 80f)
                horizontalLineTo(212f)
                curveToRelative(12.87f, 0f, 16.71f, 17.5f, 5f, 22.9f)
                lineTo(160f, 128f)
                lineToRelative(22.87f, 86.93f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -21.75f, 10.14f)
                lineTo(128f, 168f)
                lineTo(94.88f, 225.07f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -21.75f, -10.14f)
                lineTo(96f, 128f)
                close()
            }
        }.build()

        return _PersonArmsSpreadLight!!
    }

@Suppress("ObjectPropertyName")
private var _PersonArmsSpreadLight: ImageVector? = null
