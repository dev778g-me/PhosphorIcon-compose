package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.CloverLight: ImageVector
    get() {
        if (_CloverLight != null) {
            return _CloverLight!!
        }
        _CloverLight = ImageVector.Builder(
            name = "Light.CloverLight",
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
                moveTo(128f, 120f)
                reflectiveCurveToRelative(90f, -96f, 0f, -96f)
                reflectiveCurveTo(128f, 120f, 128f, 120f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 120f)
                reflectiveCurveToRelative(-96f, -90f, -96f, 0f)
                reflectiveCurveTo(128f, 120f, 128f, 120f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 120f)
                reflectiveCurveToRelative(-90f, 96f, 0f, 96f)
                reflectiveCurveTo(128f, 120f, 128f, 120f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 120f)
                reflectiveCurveToRelative(96f, 90f, 96f, 0f)
                reflectiveCurveTo(128f, 120f, 128f, 120f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 120f)
                reflectiveCurveToRelative(64f, 56f, 80f, 120f)
            }
        }.build()

        return _CloverLight!!
    }

@Suppress("ObjectPropertyName")
private var _CloverLight: ImageVector? = null
