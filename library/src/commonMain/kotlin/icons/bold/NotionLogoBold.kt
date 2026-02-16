package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.NotionLogoBold: ImageVector
    get() {
        if (_NotionLogoBold != null) {
            return _NotionLogoBold!!
        }
        _NotionLogoBold = ImageVector.Builder(
            name = "Bold.NotionLogoBold",
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
                moveTo(40f, 48f)
                lineToRelative(20f, 0f)
                lineToRelative(88f, 160f)
                lineToRelative(48f, 0f)
                lineToRelative(0f, -160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 208f)
                lineTo(80f, 208f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 48f)
                lineTo(216f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(196f, 208f)
                lineToRelative(-88f, -160f)
                lineToRelative(-48f, 0f)
                lineToRelative(0f, 160f)
            }
        }.build()

        return _NotionLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _NotionLogoBold: ImageVector? = null
