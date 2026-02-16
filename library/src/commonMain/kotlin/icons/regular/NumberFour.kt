package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.NumberFour: ImageVector
    get() {
        if (_NumberFour != null) {
            return _NumberFour!!
        }
        _NumberFour = ImageVector.Builder(
            name = "Regular.NumberFour",
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
                moveTo(184f, 168f)
                lineToRelative(-120f, 0f)
                lineToRelative(96f, -120f)
                lineToRelative(0f, 160f)
            }
        }.build()

        return _NumberFour!!
    }

@Suppress("ObjectPropertyName")
private var _NumberFour: ImageVector? = null
