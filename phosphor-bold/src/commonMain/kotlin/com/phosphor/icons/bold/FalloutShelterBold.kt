package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FalloutShelterBold: ImageVector
    get() {
        if (_FalloutShelterBold != null) {
            return _FalloutShelterBold!!
        }
        _FalloutShelterBold = ImageVector.Builder(
            name = "Bold.FalloutShelterBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(162.58f, 78.34f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 72f)
                horizontalLineTo(104f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 94f, 90.66f)
                lineToRelative(24f, 36f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 0f)
                lineToRelative(24f, -36f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 162.58f, 78.34f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(194.58f, 126.34f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 120f)
                horizontalLineTo(136f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, 18.66f)
                lineToRelative(24f, 36f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 0f)
                lineToRelative(24f, -36f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 194.58f, 126.34f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(130.58f, 126.34f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 120f)
                horizontalLineTo(72f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, 18.66f)
                lineToRelative(24f, 36f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 0f)
                lineToRelative(24f, -36f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 130.58f, 126.34f)
                close()
            }
        }.build()

        return _FalloutShelterBold!!
    }

@Suppress("ObjectPropertyName")
private var _FalloutShelterBold: ImageVector? = null
