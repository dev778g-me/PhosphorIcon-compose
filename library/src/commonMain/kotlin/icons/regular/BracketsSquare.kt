package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.BracketsSquare: ImageVector
    get() {
        if (_BracketsSquare != null) {
            return _BracketsSquare!!
        }
        _BracketsSquare = ImageVector.Builder(
            name = "Regular.BracketsSquare",
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
                moveTo(80f, 40f)
                lineToRelative(-40f, 0f)
                lineToRelative(0f, 176f)
                lineToRelative(40f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 40f)
                lineToRelative(40f, 0f)
                lineToRelative(0f, 176f)
                lineToRelative(-40f, 0f)
            }
        }.build()

        return _BracketsSquare!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsSquare: ImageVector? = null
