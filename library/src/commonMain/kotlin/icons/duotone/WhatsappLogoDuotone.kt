package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.WhatsappLogoDuotone: ImageVector
    get() {
        if (_WhatsappLogoDuotone != null) {
            return _WhatsappLogoDuotone!!
        }
        _WhatsappLogoDuotone = ImageVector.Builder(
            name = "Duotone.WhatsappLogoDuotone",
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
                moveTo(128f, 32f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44.89f, 176.07f)
                horizontalLineToRelative(0f)
                lineTo(32.42f, 213.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.12f, 10.12f)
                lineToRelative(37.39f, -12.47f)
                horizontalLineToRelative(0f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 32f)
                close()
                moveTo(152f, 184f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, -80f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                lineToRelative(16f, 32f)
                lineToRelative(-12.32f, 18.47f)
                arcToRelative(48.19f, 48.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.85f, 25.85f)
                lineTo(152f, 136f)
                lineToRelative(32f, 16f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 184f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 104f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                lineToRelative(16f, 32f)
                lineToRelative(-12.32f, 18.47f)
                arcToRelative(48.19f, 48.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.85f, 25.85f)
                lineTo(152f, 136f)
                lineToRelative(32f, 16f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 104f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
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

        return _WhatsappLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WhatsappLogoDuotone: ImageVector? = null
