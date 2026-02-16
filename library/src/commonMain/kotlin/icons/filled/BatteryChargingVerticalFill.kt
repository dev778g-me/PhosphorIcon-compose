package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BatteryChargingVerticalFill: ImageVector
    get() {
        if (_BatteryChargingVerticalFill != null) {
            return _BatteryChargingVerticalFill!!
        }
        _BatteryChargingVerticalFill = ImageVector.Builder(
            name = "Filled.BatteryChargingVerticalFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(176f, 32f)
                horizontalLineTo(80f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
                verticalLineTo(224f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                horizontalLineToRelative(96f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                verticalLineTo(56f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 32f)
                close()
                moveTo(151.16f, 139.58f)
                lineToRelative(-16f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.32f, -7.16f)
                lineTo(131.06f, 144f)
                horizontalLineTo(112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.16f, -11.58f)
                lineToRelative(16f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.32f, 7.16f)
                lineTo(124.94f, 128f)
                horizontalLineTo(144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.16f, 11.58f)
                close()
                moveTo(88f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineTo(96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 8f)
                close()
            }
        }.build()

        return _BatteryChargingVerticalFill!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryChargingVerticalFill: ImageVector? = null
