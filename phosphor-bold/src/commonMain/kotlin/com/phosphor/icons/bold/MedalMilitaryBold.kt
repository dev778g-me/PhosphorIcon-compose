package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.MedalMilitaryBold: ImageVector
    get() {
        if (_MedalMilitaryBold != null) {
            return _MedalMilitaryBold!!
        }
        _MedalMilitaryBold = ImageVector.Builder(
            name = "Bold.MedalMilitaryBold",
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
                moveTo(128f, 192f)
                moveToRelative(-40f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 152f)
                lineToRelative(82.72f, -37.6f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.28f, -8.2f)
                verticalLineTo(57f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
                horizontalLineTo(49f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, 9f)
                verticalLineToRelative(49.2f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.28f, 8.2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 48f)
                lineTo(168f, 133.82f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 48f)
                lineTo(88f, 133.82f)
            }
        }.build()

        return _MedalMilitaryBold!!
    }

@Suppress("ObjectPropertyName")
private var _MedalMilitaryBold: ImageVector? = null
