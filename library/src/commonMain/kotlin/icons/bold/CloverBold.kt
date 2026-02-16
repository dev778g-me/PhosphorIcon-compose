package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.CloverBold: ImageVector
    get() {
        if (_CloverBold != null) {
            return _CloverBold!!
        }
        _CloverBold = ImageVector.Builder(
            name = "Bold.CloverBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
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
                strokeLineWidth = 24f,
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
                strokeLineWidth = 24f,
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
                strokeLineWidth = 24f,
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
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 120f)
                reflectiveCurveToRelative(64f, 56f, 80f, 120f)
            }
        }.build()

        return _CloverBold!!
    }

@Suppress("ObjectPropertyName")
private var _CloverBold: ImageVector? = null
