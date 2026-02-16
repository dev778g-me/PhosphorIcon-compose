package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CopyrightFill: ImageVector
    get() {
        if (_CopyrightFill != null) {
            return _CopyrightFill!!
        }
        _CopyrightFill = ImageVector.Builder(
            name = "Filled.CopyrightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 56f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, 72f, 72f)
                arcTo(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 56f)
                close()
                moveTo(128f, 160f)
                arcToRelative(31.8f, 31.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.61f, -12.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.79f, 9.61f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -57.63f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.79f, 9.61f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 160f)
                close()
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(128f, 216f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 88f, -88f)
                arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 216f)
                close()
            }
        }.build()

        return _CopyrightFill!!
    }

@Suppress("ObjectPropertyName")
private var _CopyrightFill: ImageVector? = null
