package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.CodeSimpleBold: ImageVector
    get() {
        if (_CodeSimpleBold != null) {
            return _CodeSimpleBold!!
        }
        _CodeSimpleBold = ImageVector.Builder(
            name = "Bold.CodeSimpleBold",
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
                moveTo(88f, 64f)
                lineToRelative(-72f, 64f)
                lineToRelative(72f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 64f)
                lineToRelative(72f, 64f)
                lineToRelative(-72f, 64f)
            }
        }.build()

        return _CodeSimpleBold!!
    }

@Suppress("ObjectPropertyName")
private var _CodeSimpleBold: ImageVector? = null
