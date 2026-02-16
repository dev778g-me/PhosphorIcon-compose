package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.AirplaneTiltThin: ImageVector
    get() {
        if (_AirplaneTiltThin != null) {
            return _AirplaneTiltThin!!
        }
        _AirplaneTiltThin = ImageVector.Builder(
            name = "Thin.AirplaneTiltThin",
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
                moveTo(88f, 224f)
                lineToRelative(24f, -24f)
                verticalLineTo(176f)
                lineToRelative(24f, -24f)
                lineToRelative(48f, 72f)
                lineToRelative(24f, -24f)
                lineToRelative(-32f, -88f)
                lineToRelative(33f, -31f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 175f, 47f)
                lineTo(144f, 80f)
                lineTo(56f, 48f)
                lineTo(32f, 72f)
                lineToRelative(72f, 48f)
                lineTo(80f, 144f)
                horizontalLineTo(56f)
                lineTo(32f, 168f)
                lineToRelative(40f, 16f)
                close()
            }
        }.build()

        return _AirplaneTiltThin!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneTiltThin: ImageVector? = null
