package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.NumberZero: ImageVector
    get() {
        if (_NumberZero != null) {
            return _NumberZero!!
        }
        _NumberZero = ImageVector.Builder(
            name = "Regular.NumberZero",
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
                moveTo(64f, 128f)
                arcToRelative(64f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 0f)
                arcToRelative(64f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, -128f, 0f)
                close()
            }
        }.build()

        return _NumberZero!!
    }

@Suppress("ObjectPropertyName")
private var _NumberZero: ImageVector? = null
