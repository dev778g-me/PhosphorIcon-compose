package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.MessengerLogo: ImageVector
    get() {
        if (_MessengerLogo != null) {
            return _MessengerLogo!!
        }
        _MessengerLogo = ImageVector.Builder(
            name = "Regular.MessengerLogo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 144f)
                lineToRelative(32f, -32f)
                lineToRelative(32f, 32f)
                lineToRelative(32f, -32f)
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

        return _MessengerLogo!!
    }

@Suppress("ObjectPropertyName")
private var _MessengerLogo: ImageVector? = null
