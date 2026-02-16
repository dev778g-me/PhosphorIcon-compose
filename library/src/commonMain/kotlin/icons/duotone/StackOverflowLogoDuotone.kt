package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.StackOverflowLogoDuotone: ImageVector
    get() {
        if (_StackOverflowLogoDuotone != null) {
            return _StackOverflowLogoDuotone!!
        }
        _StackOverflowLogoDuotone = ImageVector.Builder(
            name = "Duotone.StackOverflowLogoDuotone",
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
                moveTo(48f, 152f)
                lineToRelative(0f, 64f)
                lineToRelative(160f, 0f)
                lineToRelative(0f, -64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 176f)
                lineTo(168f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(94.95f, 123.2f)
                lineTo(172.23f, 143.91f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(115.33f, 74f)
                lineTo(184.61f, 114f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(147.75f, 31.75f)
                lineTo(204.32f, 88.32f)
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(48f, 152f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(-160f)
                close()
            }
        }.build()

        return _StackOverflowLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _StackOverflowLogoDuotone: ImageVector? = null
