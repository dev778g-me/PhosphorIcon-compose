package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MeteorFill: ImageVector
    get() {
        if (_MeteorFill != null) {
            return _MeteorFill!!
        }
        _MeteorFill = ImageVector.Builder(
            name = "Filled.MeteorFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(136f, 160f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 160f)
                close()
                moveTo(210.34f, 122.34f)
                lineTo(162.34f, 170.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                lineToRelative(48f, -48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                close()
                moveTo(189.66f, 109.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                lineToRelative(-24f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                close()
                moveTo(229.66f, 58.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineToRelative(-16f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                lineToRelative(16f, -16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 229.66f, 58.34f)
                close()
                moveTo(122.34f, 101.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 0f)
                lineToRelative(72f, -72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -11.32f, -11.32f)
                lineToRelative(-72f, 72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 122.34f, 101.66f)
                close()
                moveTo(135.6f, 199.6f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -79.2f, -79.2f)
                lineToRelative(82.75f, -82.74f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -11.32f, -11.32f)
                lineTo(45.09f, 109.09f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, 146.91f, 210.91f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 135.6f, 199.6f)
                close()
            }
        }.build()

        return _MeteorFill!!
    }

@Suppress("ObjectPropertyName")
private var _MeteorFill: ImageVector? = null
