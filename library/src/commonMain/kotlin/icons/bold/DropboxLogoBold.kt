package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.DropboxLogoBold: ImageVector
    get() {
        if (_DropboxLogoBold != null) {
            return _DropboxLogoBold!!
        }
        _DropboxLogoBold = ImageVector.Builder(
            name = "Bold.DropboxLogoBold",
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
                moveTo(76f, 48f)
                lineToRelative(-52f, 36f)
                lineToRelative(52f, 36f)
                lineToRelative(52f, -36f)
                lineToRelative(-52f, -36f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180f, 48f)
                lineToRelative(-52f, 36f)
                lineToRelative(52f, 36f)
                lineToRelative(52f, -36f)
                lineToRelative(-52f, -36f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(76f, 120f)
                lineToRelative(-52f, 36f)
                lineToRelative(52f, 36f)
                lineToRelative(52f, -36f)
                lineToRelative(-52f, -36f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180f, 120f)
                lineToRelative(-52f, 36f)
                lineToRelative(52f, 36f)
                lineToRelative(52f, -36f)
                lineToRelative(-52f, -36f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(111.14f, 216.32f)
                lineToRelative(16.86f, 11.68f)
                lineToRelative(16.86f, -11.68f)
            }
        }.build()

        return _DropboxLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _DropboxLogoBold: ImageVector? = null
