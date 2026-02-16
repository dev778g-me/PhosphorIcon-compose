package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.TidalLogo: ImageVector
    get() {
        if (_TidalLogo != null) {
            return _TidalLogo!!
        }
        _TidalLogo = ImageVector.Builder(
            name = "Regular.TidalLogo",
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
                moveTo(8.01f, 96f)
                lineToRelative(40f, -40f)
                lineToRelative(40f, 40f)
                lineToRelative(-40f, 40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88.01f, 96f)
                lineToRelative(40f, -40f)
                lineToRelative(40f, 40f)
                lineToRelative(-40f, 40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88.01f, 176f)
                lineToRelative(40f, -40f)
                lineToRelative(40f, 40f)
                lineToRelative(-40f, 40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168.01f, 96f)
                lineToRelative(40f, -40f)
                lineToRelative(40f, 40f)
                lineToRelative(-40f, 40f)
                close()
            }
        }.build()

        return _TidalLogo!!
    }

@Suppress("ObjectPropertyName")
private var _TidalLogo: ImageVector? = null
