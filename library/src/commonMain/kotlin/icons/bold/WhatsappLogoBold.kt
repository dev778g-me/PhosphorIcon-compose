package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.WhatsappLogoBold: ImageVector
    get() {
        if (_WhatsappLogoBold != null) {
            return _WhatsappLogoBold!!
        }
        _WhatsappLogoBold = ImageVector.Builder(
            name = "Bold.WhatsappLogoBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 176f)
                arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -72f, -72f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 99.29f, 80.46f)
                lineToRelative(11.48f, 23f)
                lineTo(98.65f, 121.6f)
                lineToRelative(1.65f, 4f)
                arcToRelative(56.47f, 56.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 30.15f, 30.15f)
                lineToRelative(4f, 1.65f)
                lineToRelative(18.17f, -12.12f)
                lineToRelative(23f, 11.48f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 176f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(79.93f, 211.11f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -35f, -35f)
                horizontalLineToRelative(0f)
                lineTo(32.42f, 213.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.12f, 10.12f)
                lineToRelative(37.39f, -12.47f)
                close()
            }
        }.build()

        return _WhatsappLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _WhatsappLogoBold: ImageVector? = null
