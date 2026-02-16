package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.NumberCircleZeroThin: ImageVector
    get() {
        if (_NumberCircleZeroThin != null) {
            return _NumberCircleZeroThin!!
        }
        _NumberCircleZeroThin = ImageVector.Builder(
            name = "Thin.NumberCircleZeroThin",
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
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92f, 128f)
                arcToRelative(36f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 72f, 0f)
                arcToRelative(36f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -72f, 0f)
                close()
            }
        }.build()

        return _NumberCircleZeroThin!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircleZeroThin: ImageVector? = null
