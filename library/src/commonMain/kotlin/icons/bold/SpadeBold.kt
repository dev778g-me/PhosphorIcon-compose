package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.SpadeBold: ImageVector
    get() {
        if (_SpadeBold != null) {
            return _SpadeBold!!
        }
        _SpadeBold = ImageVector.Builder(
            name = "Bold.SpadeBold",
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
                moveTo(150.54f, 176.7f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 136f)
                curveToRelative(0f, -64f, -96f, -112f, -96f, -112f)
                reflectiveCurveTo(32f, 72f, 32f, 136f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 73.46f, 40.7f)
                lineTo(96f, 224f)
                horizontalLineToRelative(64f)
                close()
            }
        }.build()

        return _SpadeBold!!
    }

@Suppress("ObjectPropertyName")
private var _SpadeBold: ImageVector? = null
