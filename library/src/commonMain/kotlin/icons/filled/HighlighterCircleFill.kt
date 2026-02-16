package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HighlighterCircleFill: ImageVector
    get() {
        if (_HighlighterCircleFill != null) {
            return _HighlighterCircleFill!!
        }
        _HighlighterCircleFill = ImageVector.Builder(
            name = "Filled.HighlighterCircleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(201.54f, 54.46f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54.46f, 201.54f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 201.54f, 54.46f)
                close()
                moveTo(96f, 210f)
                lineTo(96f, 152f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(58f)
                arcToRelative(88.33f, 88.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 0f)
                close()
                moveTo(190.22f, 190.22f)
                arcTo(88.09f, 88.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 201.77f)
                lineTo(176f, 152f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(160f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.58f, -7.16f)
                lineToRelative(-48f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 96f)
                verticalLineToRelative(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(49.77f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 110.22f, -11.55f)
                close()
            }
        }.build()

        return _HighlighterCircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _HighlighterCircleFill: ImageVector? = null
