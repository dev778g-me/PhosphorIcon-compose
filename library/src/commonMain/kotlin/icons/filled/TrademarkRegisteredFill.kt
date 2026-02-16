package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TrademarkRegisteredFill: ImageVector
    get() {
        if (_TrademarkRegisteredFill != null) {
            return _TrademarkRegisteredFill!!
        }
        _TrademarkRegisteredFill = ImageVector.Builder(
            name = "Filled.TrademarkRegisteredFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 112f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(112f, 128f)
                lineTo(112f, 96f)
                horizontalLineToRelative(24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 112f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(216f, 128f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, -88f, 88f)
                arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 128f)
                close()
                moveTo(200f, 128f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72f, -72f)
                arcTo(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 128f)
                close()
                moveTo(166.66f, 163.56f)
                lineTo(151.09f, 140.21f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 80f)
                lineTo(104f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(112f, 144f)
                horizontalLineToRelative(22.39f)
                lineToRelative(19f, 28.44f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.32f, -8.88f)
                close()
            }
        }.build()

        return _TrademarkRegisteredFill!!
    }

@Suppress("ObjectPropertyName")
private var _TrademarkRegisteredFill: ImageVector? = null
