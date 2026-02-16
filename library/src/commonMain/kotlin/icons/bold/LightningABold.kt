package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.LightningABold: ImageVector
    get() {
        if (_LightningABold != null) {
            return _LightningABold!!
        }
        _LightningABold = ImageVector.Builder(
            name = "Bold.LightningABold",
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
                moveTo(127.2f, 24f)
                lineToRelative(-15.2f, 64f)
                lineToRelative(56f, 25.14f)
                lineToRelative(-95.2f, 102.86f)
                lineToRelative(15.2f, -64f)
                lineToRelative(-56f, -25.14f)
                lineToRelative(95.2f, -102.86f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 216f)
                lineToRelative(-36f, -72f)
                lineToRelative(-36f, 72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 200f)
                lineTo(168f, 200f)
            }
        }.build()

        return _LightningABold!!
    }

@Suppress("ObjectPropertyName")
private var _LightningABold: ImageVector? = null
