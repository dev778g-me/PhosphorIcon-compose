package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.SkypeLogoBold: ImageVector
    get() {
        if (_SkypeLogoBold != null) {
            return _SkypeLogoBold!!
        }
        _SkypeLogoBold = ImageVector.Builder(
            name = "Bold.SkypeLogoBold",
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
                moveTo(96.44f, 156f)
                curveToRelative(2.54f, 11.35f, 15.7f, 20f, 31.56f, 20f)
                curveToRelative(17.67f, 0f, 32f, -10.75f, 32f, -24f)
                curveToRelative(0f, -32f, -62.22f, -20f, -62.22f, -48f)
                curveToRelative(0f, -13.25f, 12.55f, -24f, 30.22f, -24f)
                curveToRelative(13.25f, 0f, 23.63f, 6f, 28f, 14.66f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(214f, 146.69f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 146.69f, 214f)
                arcTo(88.07f, 88.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 42f, 109.31f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 109.31f, 42f)
                arcTo(88.07f, 88.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 214f, 146.69f)
                close()
            }
        }.build()

        return _SkypeLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _SkypeLogoBold: ImageVector? = null
