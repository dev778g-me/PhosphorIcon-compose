package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MailboxFill: ImageVector
    get() {
        if (_MailboxFill != null) {
            return _MailboxFill!!
        }
        _MailboxFill = ImageVector.Builder(
            name = "Filled.MailboxFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(104f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(56f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(96f, 144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 152f)
                close()
                moveTo(168f, 32f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(160f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(152f, 56f)
                horizontalLineToRelative(16f)
                close()
                moveTo(240f, 116f)
                verticalLineToRelative(60f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(136f, 192f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(120f, 192f)
                lineTo(32f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(16f, 116f)
                arcTo(60.07f, 60.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 56f)
                horizontalLineToRelative(76f)
                verticalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(168f, 56f)
                horizontalLineToRelative(12f)
                arcTo(60.07f, 60.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 116f)
                close()
                moveTo(120f, 116f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -88f, 0f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(88f)
                close()
            }
        }.build()

        return _MailboxFill!!
    }

@Suppress("ObjectPropertyName")
private var _MailboxFill: ImageVector? = null
