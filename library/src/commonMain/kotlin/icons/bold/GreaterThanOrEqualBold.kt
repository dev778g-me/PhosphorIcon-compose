package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.GreaterThanOrEqualBold: ImageVector
    get() {
        if (_GreaterThanOrEqualBold != null) {
            return _GreaterThanOrEqualBold!!
        }
        _GreaterThanOrEqualBold = ImageVector.Builder(
            name = "Bold.GreaterThanOrEqualBold",
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
                moveTo(56f, 48f)
                lineToRelative(152f, 56f)
                lineToRelative(-152f, 56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 200f)
                lineTo(56f, 200f)
            }
        }.build()

        return _GreaterThanOrEqualBold!!
    }

@Suppress("ObjectPropertyName")
private var _GreaterThanOrEqualBold: ImageVector? = null
