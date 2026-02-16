package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PhoneDisconnectFill: ImageVector
    get() {
        if (_PhoneDisconnectFill != null) {
            return _PhoneDisconnectFill!!
        }
        _PhoneDisconnectFill = ImageVector.Builder(
            name = "Filled.PhoneDisconnectFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(236.28f, 161.84f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18.38f, 5.06f)
                lineToRelative(-49f, -17.39f)
                lineToRelative(-0.29f, -0.11f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.72f, -11.59f)
                lineToRelative(-6.21f, -29.75f)
                horizontalLineToRelative(0f)
                arcToRelative(76.52f, 76.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -49.68f, 0.11f)
                lineToRelative(-5.9f, 29.52f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.75f, 11.73f)
                lineToRelative(-0.29f, 0.11f)
                lineToRelative(-49f, 17.37f)
                arcTo(15.8f, 15.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32.35f, 168f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.63f, -6.14f)
                curveToRelative(-17.23f, -22.22f, -15.3f, -51.71f, 4.69f, -71.71f)
                curveToRelative(56.15f, -56.17f, 151f, -56.17f, 207.18f, 0f)
                horizontalLineToRelative(0f)
                curveTo(251.58f, 110.13f, 253.51f, 139.62f, 236.28f, 161.84f)
                close()
                moveTo(216f, 192f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
            }
        }.build()

        return _PhoneDisconnectFill!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneDisconnectFill: ImageVector? = null
