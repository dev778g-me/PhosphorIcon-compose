package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.NumberFive: ImageVector
    get() {
        if (_NumberFive != null) {
            return _NumberFive!!
        }
        _NumberFive = ImageVector.Builder(
            name = "Regular.NumberFive",
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
                moveTo(88f, 195.78f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.92f, -72.36f)
                lineTo(104f, 48f)
                horizontalLineToRelative(64f)
            }
        }.build()

        return _NumberFive!!
    }

@Suppress("ObjectPropertyName")
private var _NumberFive: ImageVector? = null
