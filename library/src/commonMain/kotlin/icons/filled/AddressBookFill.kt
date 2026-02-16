package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.AddressBookFill: ImageVector
    get() {
        if (_AddressBookFill != null) {
            return _AddressBookFill!!
        }
        _AddressBookFill = ImageVector.Builder(
            name = "Filled.AddressBookFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(160f, 112f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, -24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 112f)
                close()
                moveTo(224f, 40f)
                lineTo(224f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(64f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(48f, 192f)
                lineTo(32f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(48f, 176f)
                lineTo(48f, 136f)
                lineTo(32f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(48f, 120f)
                lineTo(48f, 80f)
                lineTo(32f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(48f, 64f)
                lineTo(48f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 24f)
                lineTo(208f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 40f)
                close()
                moveTo(190.4f, 163.2f)
                arcTo(67.88f, 67.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 163f, 141.51f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -53.94f, 0f)
                arcTo(67.88f, 67.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 81.6f, 163.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.8f, 9.6f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 83.2f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.8f, -9.6f)
                close()
            }
        }.build()

        return _AddressBookFill!!
    }

@Suppress("ObjectPropertyName")
private var _AddressBookFill: ImageVector? = null
