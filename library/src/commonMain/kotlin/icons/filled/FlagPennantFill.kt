package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FlagPennantFill: ImageVector
    get() {
        if (_FlagPennantFill != null) {
            return _FlagPennantFill!!
        }
        _FlagPennantFill = ImageVector.Builder(
            name = "Filled.FlagPennantFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.37f, 7.56f)
                lineTo(64f, 173.69f)
                verticalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.63f, -7.56f)
                lineToRelative(184f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 104f)
                close()
            }
        }.build()

        return _FlagPennantFill!!
    }

@Suppress("ObjectPropertyName")
private var _FlagPennantFill: ImageVector? = null
