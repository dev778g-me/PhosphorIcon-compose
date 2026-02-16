package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.NumberZeroThin: ImageVector
    get() {
        if (_NumberZeroThin != null) {
            return _NumberZeroThin!!
        }
        _NumberZeroThin = ImageVector.Builder(
            name = "Thin.NumberZeroThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 128f)
                arcToRelative(64f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 0f)
                arcToRelative(64f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, -128f, 0f)
                close()
            }
        }.build()

        return _NumberZeroThin!!
    }

@Suppress("ObjectPropertyName")
private var _NumberZeroThin: ImageVector? = null
