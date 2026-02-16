package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.ArrowBendRightUpLight: ImageVector
    get() {
        if (_ArrowBendRightUpLight != null) {
            return _ArrowBendRightUpLight!!
        }
        _ArrowBendRightUpLight = ImageVector.Builder(
            name = "Light.ArrowBendRightUpLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 80f)
                lineToRelative(48f, -48f)
                lineToRelative(48f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 224f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, -96f)
                verticalLineTo(32f)
            }
        }.build()

        return _ArrowBendRightUpLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendRightUpLight: ImageVector? = null
