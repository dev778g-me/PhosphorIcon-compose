package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.SignatureThin: ImageVector
    get() {
        if (_SignatureThin != null) {
            return _SignatureThin!!
        }
        _SignatureThin = ImageVector.Builder(
            name = "Thin.SignatureThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 176f)
                lineTo(232f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 224f)
                reflectiveCurveTo(139.52f, 32f, 77.91f, 32f)
                curveTo(32.07f, 32f, 31.58f, 225.11f, 128f, 104.19f)
                curveToRelative(0f, 0f, 8.11f, 39.44f, 27.23f, 39.81f)
                curveToRelative(7.72f, 0.15f, 17.25f, -6.31f, 28.77f, -24f)
                curveToRelative(0f, 0f, 0f, 24f, 48f, 24f)
            }
        }.build()

        return _SignatureThin!!
    }

@Suppress("ObjectPropertyName")
private var _SignatureThin: ImageVector? = null
