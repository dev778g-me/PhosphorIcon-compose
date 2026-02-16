package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.NotionLogoDuotone: ImageVector
    get() {
        if (_NotionLogoDuotone != null) {
            return _NotionLogoDuotone!!
        }
        _NotionLogoDuotone = ImageVector.Builder(
            name = "Duotone.NotionLogoDuotone",
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
                moveTo(64f, 48f)
                lineToRelative(88f, 160f)
                lineToRelative(40f, 0f)
                lineToRelative(-88f, -160f)
                lineToRelative(-40f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 48f)
                lineToRelative(24f, 0f)
                lineToRelative(88f, 160f)
                lineToRelative(40f, 0f)
                lineToRelative(0f, -160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 208f)
                lineTo(88f, 208f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 48f)
                lineTo(216f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 208f)
                lineToRelative(-88f, -160f)
                lineToRelative(-40f, 0f)
                lineToRelative(0f, 160f)
            }
        }.build()

        return _NotionLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _NotionLogoDuotone: ImageVector? = null
