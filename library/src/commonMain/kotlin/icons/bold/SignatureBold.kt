package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.SignatureBold: ImageVector
    get() {
        if (_SignatureBold != null) {
            return _SignatureBold!!
        }
        _SignatureBold = ImageVector.Builder(
            name = "Bold.SignatureBold",
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
                moveTo(24f, 176f)
                lineTo(232f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 224f)
                reflectiveCurveTo(139.6f, 32f, 78f, 32f)
                curveToRelative(-45.84f, 0f, -46.41f, 184.91f, 50f, 64f)
                curveToRelative(0f, 0f, 16f, 77.43f, 56f, 16f)
                curveToRelative(0f, 0f, 0f, 24f, 48f, 24f)
            }
        }.build()

        return _SignatureBold!!
    }

@Suppress("ObjectPropertyName")
private var _SignatureBold: ImageVector? = null
