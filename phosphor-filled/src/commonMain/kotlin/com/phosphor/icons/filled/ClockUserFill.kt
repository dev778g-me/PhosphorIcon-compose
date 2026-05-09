package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ClockUserFill: ImageVector
    get() {
        if (_ClockUserFill != null) {
            return _ClockUserFill!!
        }
        _ClockUserFill = ImageVector.Builder(
            name = "Filled.ClockUserFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(136f, 72f)
                verticalLineToRelative(43.06f)
                lineToRelative(36.42f, -18.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.16f, 14.32f)
                lineToRelative(-48f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 128f)
                lineTo(120f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(128f, 216f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 88f, -88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(214.62f, 198.62f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, -45.24f, 0f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152.27f, 222f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 232f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.73f, -10.06f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 214.62f, 198.62f)
                close()
            }
        }.build()

        return _ClockUserFill!!
    }

@Suppress("ObjectPropertyName")
private var _ClockUserFill: ImageVector? = null
